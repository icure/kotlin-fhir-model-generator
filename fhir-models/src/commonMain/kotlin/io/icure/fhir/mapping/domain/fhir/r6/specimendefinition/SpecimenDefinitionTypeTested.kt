//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.specimendefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
