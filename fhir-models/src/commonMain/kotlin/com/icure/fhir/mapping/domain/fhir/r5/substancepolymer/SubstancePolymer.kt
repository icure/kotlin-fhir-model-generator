//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancepolymer

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Properties of a substance specific to it being a polymer
 *
 * Properties of a substance specific to it being a polymer.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param identifier A business idenfier for this polymer, but typically this is handled by a
 * SubstanceDefinition identifier
 * @param class_fhir Overall type of the polymer
 * @param geometry Polymer geometry, e.g. linear, branched, cross-linked, network or dendritic
 * @param modification Todo - this is intended to connect to a repeating full modification
 * structure, also used by Protein and Nucleic Acid . String is just a placeholder
 */
@SerialName("SubstancePolymer")
@Serializable
public data class SubstancePolymer(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A business idenfier for this polymer, but typically this is handled by a SubstanceDefinition
   * identifier
   */
  public val identifier: Identifier? = null,
  /**
   * Overall type of the polymer
   */
  @SerialName("class")
  public val class_fhir: CodeableConcept? = null,
  /**
   * Polymer geometry, e.g. linear, branched, cross-linked, network or dendritic
   */
  public val geometry: CodeableConcept? = null,
  public val copolymerConnectivity: List<CodeableConcept> = emptyList(),
  /**
   * Todo - this is intended to connect to a repeating full modification structure, also used by
   * Protein and Nucleic Acid . String is just a placeholder
   */
  public val modification: String? = null,
  public val monomerSet: List<SubstancePolymerMonomerSet> = emptyList(),
  public val repeat: List<SubstancePolymerRepeat> = emptyList(),
) : DomainResource
