//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * General specifications for this substance
 *
 * General specifications for this substance.
 *
 * @param id Unique id for inter-element referencing
 * @param technique The method used to find the characterization e.g. HPLC
 * @param form Describes the nature of the chemical entity and explains, for instance, whether this
 * is a base or a salt form
 * @param description The description or justification in support of the interpretation of the data
 * file
 */
@SerialName("SubstanceDefinitionCharacterization")
@Serializable
public data class SubstanceDefinitionCharacterization(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The method used to find the characterization e.g. HPLC
   */
  public val technique: CodeableConcept? = null,
  /**
   * Describes the nature of the chemical entity and explains, for instance, whether this is a base
   * or a salt form
   */
  public val form: CodeableConcept? = null,
  /**
   * The description or justification in support of the interpretation of the data file
   */
  public val description: String? = null,
  public val `file`: List<Attachment> = emptyList(),
) : BackboneElement
