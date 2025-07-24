//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.specimendefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specimen in container intended for testing by lab
 *
 * Specimen conditioned in a container as expected by the testing laboratory.
 *
 * @param id Unique id for inter-element referencing
 * @param isDerived Primary or secondary specimen
 * @param type Type of intended specimen
 * @param preference preferred | alternate
 * @param container The specimen's container
 * @param requirement Requirements for specimen delivery and special handling
 * @param retentionTime The usual time for retaining this kind of specimen
 * @param singleUse Specimen for single use only
 */
@SerialName("SpecimenDefinitionTypeTested")
@Serializable
public data class SpecimenDefinitionTypeTested(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Primary or secondary specimen
   */
  public val isDerived: Boolean? = null,
  /**
   * Type of intended specimen
   */
  public val type: CodeableConcept? = null,
  /**
   * preferred | alternate
   */
  public val preference: String? = null,
  /**
   * The specimen's container
   */
  public val container: SpecimenDefinitionTypeTestedContainer? = null,
  /**
   * Requirements for specimen delivery and special handling
   */
  public val requirement: String? = null,
  /**
   * The usual time for retaining this kind of specimen
   */
  public val retentionTime: Duration? = null,
  /**
   * Specimen for single use only
   */
  public val singleUse: Boolean? = null,
  public val rejectionCriterion: List<CodeableConcept> = emptyList(),
  public val handling: List<SpecimenDefinitionTypeTestedHandling> = emptyList(),
  public val testingDestination: List<CodeableConcept> = emptyList(),
) : BackboneElement
